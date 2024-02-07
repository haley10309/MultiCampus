var scores = [1, 2, 3, 4, 5, 6];
var totalScores = 0;

for (var i = 0; i < scores.length; i++) {
  totalScores = totalScores + scores[i];
}
var averageScores = Math.round(totalScores / scores.length);
console.log(averageScores);
document.write(averageScores + "<br>");
