package Util;

import com.bin.david.form.annotation.ColumnType;
import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;

@SmartTable(name = "neccessity")
public class Neccessity {
    @SmartColumn(id = 1,name = "序号",type = ColumnType.Child)
    private Integer number;
    @SmartColumn(id = 2,name = "名称",type = ColumnType.Child)
    private String name;
    @SmartColumn(id = 3,name = "数量",type = ColumnType.Child)
    private String count;
    @SmartColumn(id = 4,name = "要求",type = ColumnType.Child)
    private String requirement;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Neccessity(Integer number, String name, String count, String requirement) {
        this.number = number;
        this.name = name;
        this.count = count;
        this.requirement = requirement;
    }
}

