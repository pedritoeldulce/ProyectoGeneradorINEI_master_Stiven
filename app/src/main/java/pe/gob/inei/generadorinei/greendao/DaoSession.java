package pe.gob.inei.generadorinei.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig caratulaDaoConfig;
    private final DaoConfig hogarDaoConfig;
    private final DaoConfig residenteDaoConfig;
    private final DaoConfig visita_encuestadorDaoConfig;

    private final CaratulaDao caratulaDao;
    private final HogarDao hogarDao;
    private final ResidenteDao residenteDao;
    private final Visita_encuestadorDao visita_encuestadorDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        caratulaDaoConfig = daoConfigMap.get(CaratulaDao.class).clone();
        caratulaDaoConfig.initIdentityScope(type);

        hogarDaoConfig = daoConfigMap.get(HogarDao.class).clone();
        hogarDaoConfig.initIdentityScope(type);

        residenteDaoConfig = daoConfigMap.get(ResidenteDao.class).clone();
        residenteDaoConfig.initIdentityScope(type);

        visita_encuestadorDaoConfig = daoConfigMap.get(Visita_encuestadorDao.class).clone();
        visita_encuestadorDaoConfig.initIdentityScope(type);

        caratulaDao = new CaratulaDao(caratulaDaoConfig, this);
        hogarDao = new HogarDao(hogarDaoConfig, this);
        residenteDao = new ResidenteDao(residenteDaoConfig, this);
        visita_encuestadorDao = new Visita_encuestadorDao(visita_encuestadorDaoConfig, this);

        registerDao(Caratula.class, caratulaDao);
        registerDao(Hogar_g.class, hogarDao);
        registerDao(Residente_g.class, residenteDao);
        registerDao(Visita_encuestador.class, visita_encuestadorDao);
    }
    
    public void clear() {
        caratulaDaoConfig.clearIdentityScope();
        hogarDaoConfig.clearIdentityScope();
        residenteDaoConfig.clearIdentityScope();
        visita_encuestadorDaoConfig.clearIdentityScope();
    }

    public CaratulaDao getCaratulaDao() {
        return caratulaDao;
    }

    public HogarDao getHogarDao() {
        return hogarDao;
    }

    public ResidenteDao getResidenteDao() {
        return residenteDao;
    }

    public Visita_encuestadorDao getVisita_encuestadorDao() {
        return visita_encuestadorDao;
    }

}