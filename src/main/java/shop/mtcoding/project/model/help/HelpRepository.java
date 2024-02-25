package shop.mtcoding.project.model.help;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import shop.mtcoding.project.dto.help.HelpReq.HelpSaveReqDto;

import java.util.List;

@Mapper
public interface HelpRepository {
    public List<Help> findAll();

    public Help findByUserId(@Param("userId") Integer userId);

    public Help fnidBytitle(@Param("title") String title);

    public Help findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    public int insert(@Param("hDto") HelpSaveReqDto hDto);

    public int deleteById();
}
