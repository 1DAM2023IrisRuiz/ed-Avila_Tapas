package com.iris.avilaTapas.feature.tapas.presentation;
import java.util.ArrayList;

import com.iris.avilaTapas.feature.tapas.data.TapaDataRepository;
import com.iris.avilaTapas.feature.tapas.domain.GetAllTapasUseCase;
import com.iris.avilaTapas.feature.tapas.domain.Tapa;

import java.util.ArrayList;

public class MainTapa {
    public static void printTapas(){
        GetAllTapasUseCase tapasUseCase = new GetAllTapasUseCase(new TapaDataRepository());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        System.out.println(tapas.toString());

    }
}
