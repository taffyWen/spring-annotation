package condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author wen
 * @create 2020/6/7 11:54
 * 返回需要导入的组件
 */
public class MyImportSelector implements ImportSelector {
    /**
     * 返回值，就是导入到容器中的组件额度全类名  ---》相当于Import
     * AnnotationMetadata 当前标注@Import组件的类的所有注解信息
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 必须是类的全类名
        return new String[]{"bean.Blue","bean.Red"};
    }
}
