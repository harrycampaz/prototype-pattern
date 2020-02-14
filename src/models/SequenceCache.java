package models;

import java.util.Hashtable;

public class SequenceCache {
    private static Hashtable<String, Sequence> sequenceHashtable = new Hashtable<String, Sequence>();

    public static  Sequence getSequence(String sequenceId){
        Sequence cacheSequence = sequenceHashtable.get(sequenceId);

        return  (Sequence) cacheSequence.clone();
    }

    public static void loadCache(){
        Prime p = new Prime();
        p.setId("1");
        sequenceHashtable.put(p.getId(), p);


        Fibonacci f = new Fibonacci();
        f.setId("2");
        sequenceHashtable.put(f.getId(), f);

    }
}
