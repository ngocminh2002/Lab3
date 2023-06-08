package nguyenngocminh.demo.repository;

import nguyenngocminh.demo.entity.Book;
import nguyenngocminh.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
