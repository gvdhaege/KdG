package be.kdg.wielrennen.parsing;

import be.kdg.wielrennen.model.WielRenners;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WielRennersGsonParser {

    public static void writeJson(WielRenners wielRenners, String fileName) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();

        String jsonString = gson.toJson(wielRenners);
        try (FileWriter jsonWriter = new FileWriter(fileName)) {
            jsonWriter.write(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WielRenners readJson(String fileName) {
        WielRenners wielRenners = new WielRenners();
        try (BufferedReader data = new BufferedReader(new FileReader(fileName))) {

            Gson gson = new Gson();
            return gson.fromJson(data, WielRenners.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
