package org.edgexfoundry.samsung.opcua.metadata;

public enum MetaDataType {
    ALL(0),
    ADDRESSABLE(1),
    DEVICE(2),
    DEVICE_PROFILE(3);

    private int code;

    private MetaDataType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}