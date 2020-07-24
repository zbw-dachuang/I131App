package Util;

import java.util.Date;

public class recordTH {
    private Date date;
    private double T3;
    private double T4;
    private double FSH;
    private double FT3;
    private double FT4;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double t3) {
        T3 = t3;
    }

    public double getT4() {
        return T4;
    }

    public void setT4(double t4) {
        T4 = t4;
    }

    public double getFSH() {
        return FSH;
    }

    public void setFSH(double FSH) {
        this.FSH = FSH;
    }

    public double getFT3() {
        return FT3;
    }

    public void setFT3(double FT3) {
        this.FT3 = FT3;
    }

    public double getFT4() {
        return FT4;
    }

    public void setFT4(double FT4) {
        this.FT4 = FT4;
    }

    public recordTH(Date date, double t3, double t4, double FSH, double FT3, double FT4) {
        this.date = date;
        T3 = t3;
        T4 = t4;
        this.FSH = FSH;
        this.FT3 = FT3;
        this.FT4 = FT4;
    }
}
