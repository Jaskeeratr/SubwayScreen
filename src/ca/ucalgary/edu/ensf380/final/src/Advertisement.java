package cityhallads;

public class Advertisement {
    private int id;
    private String title;
    private String description;
    private String fileName;
    private String fileType;
    private String filePath;

    public Advertisement(int id, String title, String description, String fileName, String fileType, String filePath) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
