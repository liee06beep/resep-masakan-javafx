package aplikasiresep.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import aplikasiresep.model.Resep;

public class ResepController {

    @FXML
    private TextField namaField;

    @FXML
    private TextArea bahanArea;

    @FXML
    private TextArea langkahArea;

    @FXML
    private ListView<Resep> daftarResep;

    private ObservableList<Resep> resepList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        daftarResep.setItems(resepList);
    }

    @FXML
    public void tambahResep() {
        String nama = namaField.getText();
        String bahan = bahanArea.getText();
        String langkah = langkahArea.getText();

        if (!nama.isEmpty() && !bahan.isEmpty() && !langkah.isEmpty()) {
            Resep resep = new Resep(nama, bahan, langkah);
            resepList.add(resep);
            namaField.clear();
            bahanArea.clear();
            langkahArea.clear();
        }
    }

    @FXML
    public void lihatDetail() {
        Resep selected = daftarResep.getSelectionModel().getSelectedItem();
        if (selected != null) {
            bahanArea.setText(selected.getBahan());
            langkahArea.setText(selected.getLangkah());
        }
    }
}
