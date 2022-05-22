package org.willomane.mongowillo;

import com.google.gson.Gson;
import org.bson.Document;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class SerializeUtils {

    public Gson GSON = new Gson();

    public Document serializeItemStack(ItemStack itemStack){
        Map<String, Object> data = itemStack.serialize();
        String json = GSON.toJson(data);
        return Document.parse(json);
    }

}
