package org.educa.dao;

import org.educa.entity.PuntuacionEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements DaoInterface {
    @Override
    public List<PuntuacionEntity> getPuntuacion(String path) {
        List<PuntuacionEntity> puntuaciones = new ArrayList<>();

        if(new File(path).exists()){
            try {
                new File(path).createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(path))){
                while(true){
                    PuntuacionEntity p = new PuntuacionEntity(dis.readUTF(), dis.readInt(), dis.readInt());
                    puntuaciones.add(p);
                }

        }catch (EOFException e){

        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return puntuaciones;

    }

    @Override
    public void setPuntuaciones(String path, List<PuntuacionEntity> puntuaciones) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(path))){
            if (puntuaciones!=null && !puntuaciones.isEmpty()){
                for (PuntuacionEntity p : puntuaciones){
                    dos.writeUTF(p.getNombre());
                    dos.writeInt(p.getPuntuacion());
                    dos.writeInt(p.getNivel());
                }
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
