import React from "react";

export function ListofPlayers(props) {
  return (
    <div>
      <ul>
        {props.players.map((item, index) => {
          return (
            <div key={index}>
              <li>
                Mr. {item.name} <span>{item.score}</span>
              </li>
            </div>
          );
        })}
      </ul>
    </div>
  );
}

export function Scorebelow70(props) {
  let players70 = [];

  props.players.map((item) => {
    if (item.score <= 70) {
      players70.push(item);
    }
    return null;
  });

  return (
    <div>
      <ul>
        {players70.map((item, index) => {
          return (
            <div key={index}>
              <li>
                Mr. {item.name} <span>{item.score}</span>
              </li>
            </div>
          );
        })}
      </ul>
    </div>
  );
}