package com.edisonmoreno.patrones.estructurales.decorator.interfaz;

import com.edisonmoreno.patrones.estructurales.decorator.DTO.MessageDTO;

public interface NotificationSource {
    void send(MessageDTO message);
}
