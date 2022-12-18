package com.Natwest.RockPaperScissors;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @RequestMapping("/play")
    public String Game(@RequestParam("move") int move) {
        int compmove = (int)(Math.random()*(3-1+1)+1);
        if (move == compmove) {
            return ("<h1> It is tie.</h1>");
        }

        else if (compmove == 1) {
            if (move == 3) {
                return "<h2> Player2(Computer) choosed 'Rock'.<h2>"+
                " <h1>Computer Wins.<h1>";
            }
            if (move == 2) {
                return "<h2> Player2(Computer) choosed 'Rock'.<h2>"+
                        " <h1>Player Wins.<h1>";
            }
        }

        else if (compmove == 2) {
            if (move == 3) {
                return "<h2> Player2(Computer) choosed 'Paper'.<h2>"+
                        " <h1>Player Wins.<h1>";
            }
            if (move == 1) {
                return "<h2> Player2(Computer) choosed 'Paper'.<h2>"+
                        " <h1>Computer Wins.<h1>";
            }
        }

        else if (compmove == 3) {
            if (move == 1) {
                return "<h2> Player2(Computer) choosed 'Scissors'.<h2>"+
                        " <h1>Player Wins.<h1>";
            }
            if (move == 2) {
                return "<h2> Player2(Computer) choosed 'Scissors'.<h2>"+
                        " <h1>Computer Wins.<h1>";
            }
        }

        return move+"Play Rock Paper Scissor";
    }

    @RequestMapping("/")
    public String play() {
        return "<style>.playform{background:#e1051f;padding:2.7rem;border:0.1rem groove #d10918;box-shadow: 0 0 1rem #42145f}" +
                ".reset {border:0.1rem solid #42145f;color:#42145f}" +
                "input[type='radio']{cursor:pointer}</style>" +
                "<h2 style='padding:2.5rem;background:#42145f;color:#fff;align-items:center;display:flex'>Rock Paper Scissors</h2>" +
                "<form action='/play' method='post' class='playform'><div style='font-size:1.4rem;color:#fff'><input type='radio' name='move' value='1'> Rock</br>" +
                "<input type='radio' name='move' value='2' checked> Paper</br>" +
                "<input type='radio' name='move' value='3' > Scissor</br></br></div>" +
                "<input type='submit' value='Play' style='font-size:1.2rem;background:#42145f;border-color:#42145f;color:#fff;padding:0.5rem;border-radius:1rem;margin-right:1rem;cursor:pointer'>" +
                "<input type='reset' value='Reset' style='font-size:1.2rem;background:#fff;padding:0.5rem;border-radius:1rem;cursor:pointer' class='reset'></form>";
    }


}
