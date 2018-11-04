package de.htw.fiw2018.kanban;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {

    String workingDirectory = System.clearProperty("user.dir") + File.separator;


    public void createTask(Map<String, String> data) throws IOException {
        System.out.println("Your working directory: " + workingDirectory);
        String id = data.get("id");
        File file = new File(workingDirectory + id + ".txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);

                data.forEach((key, value) -> {
                    try {
                            fw.write(key + ":" + value + System.lineSeparator()); }
                    catch (IOException e) {throw new UncheckedIOException(e);}}
                );
                fw.flush();
        }
        catch (IOException e){
            throw e;
        }
    }

    public Task findTask(int id) {
    return null;
    }

    public Task updateTask(int id) {
    return null;
    }

    public boolean deleteTask(int id) {
    return true;
    }

    public List findAllTasks() {
    return null;
    }
}
