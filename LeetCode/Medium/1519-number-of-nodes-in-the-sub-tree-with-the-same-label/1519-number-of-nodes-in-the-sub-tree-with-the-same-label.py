class Solution:
    def countSubTrees(self, n: int, edges: List[List[int]], labels: str) -> List[int]:

        tree = defaultdict(lambda:defaultdict(list))
        result = [1 for i in range(n)]

        for edge in edges:
            if edge[0] == 0:
                tree[edge[0]]["to"].append(edge[1])
                tree[edge[0]]["label"] = labels[edge[0]]
                tree[edge[0]]["parent"] = -1
            elif tree[edge[0]]["parent"] == []:
                tree[edge[0]]["to"].append(edge[1])
                tree[edge[0]]["label"] = labels[edge[0]]
                tree[edge[0]]["parent"] = edge[1]
            else:
                tree[edge[0]]["to"].append(edge[1])
                tree[edge[0]]["label"] = labels[edge[0]]
            if edge[1] == 0:
                tree[edge[1]]["to"].append(edge[0])
                tree[edge[1]]["label"] = labels[edge[1]]
                tree[edge[1]]["parent"] = -1
            elif tree[edge[1]]["parent"] == []:
                tree[edge[1]]["to"].append(edge[0])
                tree[edge[1]]["label"] = labels[edge[1]]
                tree[edge[1]]["parent"] = edge[0]
            else:
                tree[edge[1]]["to"].append(edge[0])
                tree[edge[1]]["label"] = labels[edge[1]]
            
        def DFS(current):
            count = defaultdict(lambda: 0)

            for v in tree[current]["to"]:
                if v != tree[current]["parent"]:
                    temp = DFS(v)
                    for k in temp.keys():
                        count[k] += temp[k]
 
            count[tree[current]["label"]] += 1            
            result[current] = count[tree[current]["label"]]
            return count


        DFS(0)

        return result
            