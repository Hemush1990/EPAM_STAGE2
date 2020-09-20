package qacource.exceptions;

public class Group extends Faculty {

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Group(String facultyName, String groupName) {
        super(facultyName);
        this.groupName = groupName;
    }
}


