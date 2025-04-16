package com.exercicio;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TesteHibernate {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Pessoa pessoa = new Pessoa("João", 30, "123.456.789-00");
            session.save(pessoa);
            Flor flor = new Flor("Rosa", "Vermelha", 0.5);
            session.save(flor);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        HibernateUtil.shutdown();
    }
}