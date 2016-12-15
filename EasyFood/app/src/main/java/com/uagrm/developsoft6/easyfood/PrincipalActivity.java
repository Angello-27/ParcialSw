package net.megamil.restaurante;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.LinearLayout;


public class PrincipalActivity extends FragmentActivity {

    Fragment bp = new BannerPlatosFragment();
    Fragment bl = new BannerLancheFragment();
    Fragment bb = new BannerBebidasFragment();

    Fragment ll = new ListaLanchesFragment();
    Fragment lb = new ListaBebidasFragment();
    Fragment lp = new ListaPlatosFragment();


    LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        background = (LinearLayout) findViewById(R.id.background);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.frag_topo, bp);
        ft.add(R.id.frag_centro, lp);
        ft.addToBackStack(null);
        ft.commit();

    }

    public void trocaFragmentTopo(android.support.v4.app.Fragment topo){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frag_topo, topo);
        ft.commit();

    }

    public void trocaFragmentCentro(android.support.v4.app.Fragment centro){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frag_centro, centro);
        ft.commit();

    }

    public void pratos(View view){

        background.setBackgroundResource(R.drawable.background);
        trocaFragmentCentro(lp);
        trocaFragmentTopo(bp);

    }

    public void lanches(View view){

        background.setBackgroundResource(R.drawable.backgroundlanches);
        trocaFragmentCentro(ll);
        trocaFragmentTopo(bl);

    }

    public void bebidas(View view){

        background.setBackgroundResource(R.drawable.backgroundbebidas);
        trocaFragmentCentro(lb);
        trocaFragmentTopo(bb);

    }

    //Chamado ao clicar no Sobre no BannerPlatosFragment
    public void about (View view){

        AlertAboutFragment aaa = new AlertAboutFragment();

        aaa.show(getFragmentManager(), "Sobre");

    }

    //Chamado ao clicar na Semana no BannerPlatosFragment
    public void semana (View view){

        AlertSemanaFragment asf = new AlertSemanaFragment();

        asf.show(getFragmentManager(), "Semana");

    }

}
