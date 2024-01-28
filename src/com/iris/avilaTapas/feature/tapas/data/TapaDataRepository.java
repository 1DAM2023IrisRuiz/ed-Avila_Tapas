package com.iris.avilaTapas.feature.tapas.data;

import com.iris.avilaTapas.feature.tapas.domain.Tapa;
import com.iris.avilaTapas.feature.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    @Override
    public ArrayList<Tapa> obtainTapas() {
        ArrayList<Tapa> tapas = new ArrayList<>();
        tapas.add(new Tapa("0001","Ensaladilla Rusa tradicional",4.10, "Patatas, zanahorias, huevos, aceitunas rellenas, atún, mayonesa, sal, perejil","Huevo","https//..."));
        return tapas;
    }
}
