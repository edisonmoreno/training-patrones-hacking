package com.edisonmoreno.patrones.estructurales.facade;

import java.util.List;

public class DataExport {
    public String getFile(List<String> data, TypeFormatEnum format) {
        String result = "";
        switch (format) {
            case PDF:
                result = exportToPDF(data);
                break;
            case CSV:
                result = exportCSV(data);
                break;
            case IMAGE:
                result = exportJPG(data);
                break;
        }
        return result;
    }

    private String exportJPG(List<String> data) {
        return "[star-image] + ".concat(String.join("|", data)).concat("[end-image]");
    }

    private String exportCSV(List<String> data) {
        return "*CSV*".concat(String.join("|", data));
    }

    private String exportToPDF(List<String> data) {
        return String.join("|", data)
                .concat(">> *PDF*");
    }
}
