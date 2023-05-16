def round_robin(processes, quantum):
    n = len(processes)
    burst_times = processes.copy()
    waiting_times = [0] * n
    turnaround_times = [0] * n
    remaining_times = burst_times.copy()
    current_time = 0

    while True:
        all_processes_completed = True
        for i in range(n):
            if remaining_times[i] > 0:
                all_processes_completed = False

                if remaining_times[i] > quantum:
                    current_time += quantum
                    remaining_times[i] -= quantum
                else:
                    current_time += remaining_times[i]
                    waiting_times[i] = current_time - burst_times[i]
                    remaining_times[i] = 0

        if all_processes_completed:
            break

    for i in range(n):
        turnaround_times[i] = burst_times[i] + waiting_times[i]

    avg_waiting_time = sum(waiting_times) / n
    avg_turnaround_time = sum(turnaround_times) / n

    return avg_waiting_time, avg_turnaround_time


# Example usage:
processes = [4, 6, 3, 5, 2]
quantum = 2

avg_waiting_time, avg_turnaround_time = round_robin(processes, quantum)

print(f"Average Waiting Time: {avg_waiting_time}")
print(f"Average Turnaround Time: {avg_turnaround_time}")
