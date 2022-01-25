package com.feedback.app.feedback

import com.feedback.app.feedback.mapper.FeedbackMapper
import com.feedback.app.feedback.model.Feedback
import spock.lang.Specification

class FeedbackMapperTest extends Specification {
    def "Should map Feedback DTO to Feedback Entity"(){
        given: "Feedback entity"
            Feedback feedback = new Feedback();
            feedback.setId(1L)
            feedback.setDescription("Some description")
            feedback.setGrade(4.0)
            feedback.setTitle("Some title")
        when: "Map entity to DTO"
            FeedbackMapper mapper = new FeedbackMapper()
            def mappedFeedback = mapper.toDTO(feedback)
        then: "Values from DTO should be same like in entity"
            mappedFeedback.getId() == 1L
            mappedFeedback.getDescription() == "Some description"
            mappedFeedback.getGrade() == 4.0
            mappedFeedback.getTitle() == "Some title"



    }



}
