package de.kai_morich.simple_bluetooth_terminal;

import android.app.Application;

public class JsonVo extends Application {

    private String jsonTxt;

    public String getJsonTxt() {
        return jsonTxt;
    }

    public void setJsonTxt(String jsonTxt) {
        this.jsonTxt = jsonTxt;
    }
}
