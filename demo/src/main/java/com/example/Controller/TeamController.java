package com.example.Controller;

import com.example.Database.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.example.StaticFunc.Static.GetCurrentTime;

@RestController
public class TeamController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Value("${com.example.mongodb.collection.Team.power.leader}")
    private String TEAM_LEADER;
    @Value("${com.example.mongodb.collection.Team.power.admin}")
    private String TEAM_ADMIN;
    @Value("${com.example.mongodb.collection.Team.power.member}")
    private String TEAM_MEMBER;

    @PostMapping(value = "/CreateTeam")
    public String CreateTeam(@RequestBody Team team) {
        team.setPower(TEAM_LEADER);
        team.setCreateTime(GetCurrentTime());
        mongoTemplate.save(team);
        return team.getId().toString();
    }

    @PostMapping(value = "/JoinTeam")
    public String JoinTeam(@RequestBody Team team) {
        team.setPower(TEAM_MEMBER);
        mongoTemplate.save(team);
        return "successful";
    }


}
