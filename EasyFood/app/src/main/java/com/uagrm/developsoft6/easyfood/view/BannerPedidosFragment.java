package com.uagrm.developsoft6.easyfood.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.megamil.restaurante.R;

/**
 * Created by Eduardo on 29/04/2015.
 */
public class BannerPedidosFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_banner_pedidos, container, false);
    }
}
