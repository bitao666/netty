package com.bitao.task.msg;

import com.bitao.task.enums.MsgTypeEnum;

public class QuitMsg extends BaseMsg {
    public QuitMsg() {
        setType(MsgTypeEnum.QUIT);
    }
}
