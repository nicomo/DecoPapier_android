package fr.citronours.decopapier.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("0", "Décoration en papier"));
        addItem(new DummyItem("1", "Introduction"));
        addItem(new DummyItem("2", "Conseils techniques"));
        addItem(new DummyItem("3", "Kusudama"));
        addItem(new DummyItem("4", "Suspension Kirigami"));
        addItem(new DummyItem("5", "Cadre photo"));
        addItem(new DummyItem("6", "Pêle-mêle"));
        addItem(new DummyItem("7", "Trio de photophores"));
        addItem(new DummyItem("8", "Tangram géant"));
        addItem(new DummyItem("9", "Lustre piñata"));
        addItem(new DummyItem("10", "Chemin de table"));
        addItem(new DummyItem("11", "Tatô « Bon appétit »"));
        addItem(new DummyItem("12", "Cartons de table"));
        addItem(new DummyItem("13", "Eléphant de papier"));
        addItem(new DummyItem("14", "Tableaux design"));
        addItem(new DummyItem("15", "Rangement mural"));
        addItem(new DummyItem("16", "Range-documents"));
        addItem(new DummyItem("17", "Déco geek"));
        addItem(new DummyItem("18", "Lampions Washi"));
        addItem(new DummyItem("19", "Moulin à vent"));
        addItem(new DummyItem("20", "Et maintenant?"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
