package net.megamil.restaurante;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class AdapterPlatos extends BaseAdapter {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "ES"));

    private List<ObjetoPlato> pratos;
    private LayoutInflater inflater;

    public AdapterPlatos(Context context, List<ObjetoPlato> pratos){
        this.pratos = pratos;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return pratos.size();
    }

    @Override
    public Object getItem(int position) {
        return pratos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ViewHolder vh;

        if (view == null) {

            view = inflater.inflate(R.layout.lista_item,parent,false);
            vh = new ViewHolder();

            vh.img = (ImageView) view.findViewById(R.id.img);
            vh.nome = (TextView) view.findViewById(R.id.nome);
            vh.acompanhamento = (TextView) view.findViewById(R.id.acompanhamento);
            vh.preco = (TextView) view.findViewById(R.id.preco);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) view.getTag();
        }

        ObjetoPlato prato = pratos.get(position);

        if(prato.getAcompanhamento() != "") {

            vh.acompanhamento.setText("Acompañar: " + prato.getAcompanhamento());

        } else {

            vh.acompanhamento.setText("");

        }

        vh.nome.setText(prato.getNome());
        vh.preco.setText(nf.format(prato.getPreco()));

        //Trazer imagem pelo id como String (Passado pelo construtor)
        Context context = vh.img.getContext();
        int id = context.getResources().getIdentifier(prato.getImg(), "drawable", context.getPackageName());
        vh.img.setImageResource(id);

        return view;
    }

    private static class ViewHolder {
        public ImageView img;
        public TextView nome;
        public TextView acompanhamento;
        public TextView preco;
    }

}
