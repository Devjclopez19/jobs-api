package app.api.joblisting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobpost")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    private String id;
    private String profile;
    private String desc;
    private int exp;
    private String techs[];

}
