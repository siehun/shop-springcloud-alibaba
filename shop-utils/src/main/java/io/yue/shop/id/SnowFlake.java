package io.yue.shop.id;

public class SnowFlake {
    // 起始的时间戳
    private final static long START_STAMP = 1649735805910L;
    // 占用位数 sequence-12  machine-5  datacenter-5
    private final static long SEQUENCE_BIT = 12; // 序列号
    private final static long MACHINE_BIT = 5; // 机器标识
    private final static long DATACENTER_BIT = 5; // 数据中心

    // 每一部分的最大值
    private final static long MAX_DATACENTER_NUM = -1L ^ (-1L << DATACENTER_BIT);
    private final static long MAX_MACHINE_NUM = -1L ^ (-1L << MACHINE_BIT);
    private final static long MAX_SEQUENCE = -1L ^ (-1L << SEQUENCE_BIT);

    // 每个部分向左的位移
    private final static long MACHINE_LEFT = SEQUENCE_BIT;
    private final static long DATACENTER_LEFT = SEQUENCE_BIT + MACHINE_BIT;
    private final static long TIMESTMP_LEFT = DATACENTER_LEFT + DATACENTER_BIT;

    private long datacenterId; // 数据中心
    private long machineId; //机器表示
    private long sequence = 0L; // 序列号
    private long lastStmp = -1l; // 上一次的时间戳

    public SnowFlake(long datacenterId, long machineId) {
        if (datacenterId > MAX_DATACENTER_NUM || datacenterId < 0) {
            throw new IllegalArgumentException("datacenterId can't be greater than MAX_DATACENTER_NUM or less than 0");
        }
        if (machineId > MAX_MACHINE_NUM || machineId < 0) {
            throw new IllegalArgumentException("machineId can't be greater than MAX_MACHINE_NUM or less than 0");
        }
        this.datacenterId = datacenterId;
        this.machineId =  machineId;
    }

    /**
     * 产生下一个id
     */
    public synchronized long nextId() {
        long currStmp = getNewStmp();
        if (currStmp < lastStmp) {
            throw new RuntimeException("Clock moved backwards. Refusing to generate id");
        }
        if (currStmp == lastStmp) {
            sequence = (sequence + 1) & MAX_SEQUENCE;
            if (sequence == 0L) {
                currStmp = getNextMill();
            }
        } else {
            sequence = 0L;
        }
        lastStmp = currStmp;
        return (currStmp - START_STAMP) << TIMESTMP_LEFT
                | datacenterId << DATACENTER_LEFT
                | machineId << MACHINE_LEFT
                | sequence;
    }
    private long getNextMill() {
        long mill = getNewStmp();
        while (mill <= lastStmp) {
            mill = getNewStmp();
        }
        return mill;
    }

    private long getNewStmp() {
        return System.currentTimeMillis();
    }
    public static Long getMaxDataCenterNum() {
        return MAX_DATACENTER_NUM;
    }
    public static Long getMaxMachineNum() {
        return MAX_MACHINE_NUM;
    }
    public static void main(String[] args) {
        System.out.println(MAX_DATACENTER_NUM);
        System.out.println(MAX_MACHINE_NUM);
    }

}
