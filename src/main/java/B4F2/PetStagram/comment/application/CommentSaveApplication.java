package B4F2.PetStagram.comment.application;

import B4F2.PetStagram.comment.entity.Comment;
import B4F2.PetStagram.comment.model.CommentSaveDto;
import B4F2.PetStagram.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Service
@RequiredArgsConstructor
public class CommentSaveApplication {

    private final CommentService commentService;

    public String commentSave(Long feedId, CommentSaveDto commentSaveDto, String email) {

        Comment c = commentService.saveComment(feedId, commentSaveDto, email);

        return "redirect:/feed/show-comments/" + feedId;
        }

}
