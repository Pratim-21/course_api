package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// tumri pappa bhadwa
@Service
public class TopicService  {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topics> getALLTopics(){
        List<Topics> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    //todo: implement logic
    public Topics getTopic(String id){
        Topics t = topicRepository.findById(id).get();
        return t;
    }
    public void addTopic(Topics topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topics topic){
        topicRepository.save(topic);
    }
    public void deleteTopic(String id) {
       topicRepository.deleteById(id);
    }



}


