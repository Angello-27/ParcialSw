package net.megamil.restaurante;


import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class ListaPlatosFragment extends android.support.v4.app.ListFragment {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private AdapterPlatos ap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ap = new AdapterPlatos(getActivity(), ObjetoPlato.JsonChamada());

        setListAdapter(ap);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);

        ObjetoPlato prato = (ObjetoPlato) ap.getItem(position);

        Toast.makeText(getActivity(), "Plato: " + prato.getNome() + " Preçio: " + nf.format(prato.getPreco()), Toast.LENGTH_LONG).show();

    }
}
