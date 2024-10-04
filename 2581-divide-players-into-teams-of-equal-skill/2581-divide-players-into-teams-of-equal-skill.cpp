#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
public:
    long long dividePlayers(vector<int>& skill) {
        int n = skill.size();
        int group = n / 2;
        long long sum = 0;
        
        unordered_map<int, int> ourmap;
        
        // Calculate total sum of skills and populate the frequency map
        for (int i = 0; i < n; i++) {
            ourmap[skill[i]]++;
            sum += skill[i];
        }
        
        // Each team's pair sum should be the total sum divided by the number of teams
        if (sum % group != 0) return -1;  // If the sum is not divisible, return -1
        int pairsum = sum / group;
        long long finalsum = 0;
        
        for (int i = 0; i < n; i++) {
            if (ourmap[skill[i]] == 0) continue;  // Skip if the current skill is already used
            
            int x = pairsum - skill[i];
            if (ourmap[x] > 0) {
                // Make sure we have enough players for the pair
                if (x == skill[i] && ourmap[x] < 2) {
                    return -1;  // If the skill and its complement are the same, we need at least 2
                }

                // Form the pair
                finalsum += (long long) skill[i] * x;
                ourmap[skill[i]]--;
                ourmap[x]--;
            } else {
                return -1;  // If we can't form a valid team, return -1
            }
        }
        
        return finalsum;
    }
};
