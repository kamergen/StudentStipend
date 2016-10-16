package institute.service;

import institute.entity.Student;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
@Transactional
public class StudentService {

    protected static Logger logger = Logger.getLogger("service");

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public List<Student> getAll() {
        logger.debug("Retrieving all students");

        final Session session = sessionFactory.getCurrentSession();
        final Query query = session.createQuery("from Student");
        return query.list();
    }

    public List<Student> getStudentsWithStipend() {
        logger.debug("Retrieving all students with stipend");

        final Session session = sessionFactory.getCurrentSession();
        final Query query = session.createQuery("select a from Student as a, Stipend as b where a.id = b.studentId and b.status > 0");
        return query.list();
    }
}
