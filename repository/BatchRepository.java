package repository;

import model.Batch;

import java.util.ArrayList;

public interface BatchRepository {
    ArrayList<Batch> batchList=new ArrayList<>();

    boolean save(Batch batch);

    boolean isBatch(String batchName);

    Batch fetchBatch(String batchName);

    ArrayList<Batch> getBatchList();
}
