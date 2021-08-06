package composite;

import java.util.ArrayList;
import java.util.List;

public class DeptoComposite implements Departamento {
    private List<Departamento> departamentoList = new ArrayList();

    //Ejecuta el metodo getName() para cada elemento, si es otro composite va a repetir otra vez este recorrido
    @Override
    public void getName() {
        for(Departamento d : this.departamentoList) {
            d.getName();
        }
    }

    public void agregarDepto(Departamento depto) {
        this.departamentoList.add(depto);
    }
}
